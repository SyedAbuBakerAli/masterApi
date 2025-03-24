package com.master.project.controller;

import com.master.project.dto.MasterApiRequest;
import com.master.project.dto.MasterListResponse;
import com.master.project.entity.MasterEntity;
import com.master.project.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v2/master_list")
public class MasterController {

    @Autowired
    private MasterService masterService;

    @PostMapping
    public ResponseEntity<MasterListResponse> fetchMasterList(@RequestBody MasterApiRequest request) {
        MasterListResponse savedEntities = masterService.processAndSaveMasterList(request);
        return ResponseEntity.ok(savedEntities);
    }

    @PostMapping("/dummy")
    public ResponseEntity<MasterEntity> saveMasterList(@RequestBody MasterEntity request) {
        MasterEntity savedEntities = masterService.saveMasterList(request);
        return ResponseEntity.ok(savedEntities);
    }


}
