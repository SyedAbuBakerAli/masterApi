package com.master.project.service;

import com.master.project.dto.MasterApiRequest;
import com.master.project.dto.MasterListData;
import com.master.project.dto.MasterListResponse;
import com.master.project.entity.MasterEntity;
import com.master.project.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MasterService {

    @Autowired
    private MasterRepository masterRepository;

    public MasterListResponse processAndSaveMasterList(MasterApiRequest masterApiRequest){
        MasterListResponse response = new MasterListResponse();
        response.setStart(masterApiRequest.getData().getStart());
        response.setLength(masterApiRequest.getData().getLength());

        if (masterApiRequest.getData().isCountOnly()) {
            response.setTotalRecords((int) masterRepository.count());
            return response;
        }

        List<MasterEntity> masterList;

        if (masterApiRequest.getData().getSearch() != null && masterApiRequest.getData().getSearch().getValue() != null) {
            masterList = masterRepository.findByNameContaining(masterApiRequest.getData().getSearch().getValue());
        } else {
            masterList = masterRepository.findAll();
        }

        response.setTotalRecords(masterList.size());

        List<MasterListData> data = masterList.stream()
                .skip(masterApiRequest.getData().getStart())
                .limit(masterApiRequest.getData().getLength())
                .map(m -> {
                    MasterListData dto = new MasterListData();
                    dto.setParentCode(m.getParentCode());
                    dto.setParentName(m.getParentName());
                    dto.setName(m.getName());
                    dto.setPlan(m.getPlan());
                    dto.setOption(m.getOption());
                    dto.setOptionFrequency(m.getOptionFrequency());
                    dto.setSubCategory(m.getSubCategory());
                    dto.setSector(m.getSector());
                    dto.setBenchmark(m.getBenchmark());
                    dto.setFaceValue(m.getFaceValue());
                    return dto;
                }).collect(Collectors.toList());

        response.setData(data);
        return response;
    }

    public MasterEntity saveMasterList(MasterEntity masterEntityData){
        return masterRepository.save(masterEntityData);
    }
}
