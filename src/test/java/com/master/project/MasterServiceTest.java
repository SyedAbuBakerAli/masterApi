package com.master.project;

import com.master.project.dto.MasterApiRequest;
import com.master.project.dto.MasterListResponse;
import com.master.project.dto.RequestData;
import com.master.project.dto.SearchCriteria;
import com.master.project.entity.*;
import com.master.project.repository.MasterRepository;
import com.master.project.service.MasterService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MasterServiceTest {

    @InjectMocks
    private MasterService masterService;

    @Mock
    private MasterRepository masterRepository;

    @Test
    void testSaveMasterList() {
        MasterEntity masterEntity = new MasterEntity();
        masterEntity.setId(1L);
        masterEntity.setParentCode("P001");
        masterEntity.setName("Sample Name");

        when(masterRepository.save(any(MasterEntity.class))).thenReturn(masterEntity);

        MasterEntity savedEntity = masterService.saveMasterList(masterEntity);

        assertNotNull(savedEntity);
        assertEquals(1L, savedEntity.getId());
        assertEquals("P001", savedEntity.getParentCode());
    }

    @Test
    void testProcessAndSaveMasterList_WithCountOnly() {
        MasterApiRequest request = new MasterApiRequest();
        request.setData(new RequestData());
        request.getData().setCountOnly(true);
        request.getData().setStart(0);
        request.getData().setLength(10);

        when(masterRepository.count()).thenReturn(50L);

        MasterListResponse response = masterService.processAndSaveMasterList(request);

        assertNotNull(response);
        assertEquals(50, response.getTotalRecords());
        assertEquals(0, response.getStart());
        assertEquals(10, response.getLength());
    }

    @Test
    void testProcessAndSaveMasterList_WithSearch() {
        MasterApiRequest request = new MasterApiRequest();
        request.setData(new RequestData());
        request.getData().setSearch(new SearchCriteria("Test"));
        request.getData().setStart(0);
        request.getData().setLength(2);

        List<MasterEntity> mockEntities = Arrays.asList(
                new MasterEntity(1L, "P001", "Parent 1", "Test Name 1", PlanType.DIRECT, OptionType.GROWTH, OptionFrequency.Daily, "Sub 1", Sector.Agriculture, "Benchmark 1", 100),
                new MasterEntity(2L, "P002", "Parent 2", "Test Name 2", PlanType.REGULAR, OptionType.PAYOUT, OptionFrequency.Monthly, "Sub 2", Sector.Infrastructure, "Benchmark 2", 200)
        );

        when(masterRepository.findByNameContaining("Test")).thenReturn(mockEntities);

        MasterListResponse response = masterService.processAndSaveMasterList(request);

        assertNotNull(response);
        assertEquals(2, response.getTotalRecords());
        assertEquals(0, response.getStart());
        assertEquals(2, response.getLength());
        assertEquals(2, response.getData().size());
        assertEquals("Test Name 1", response.getData().get(0).getName());
    }




}
