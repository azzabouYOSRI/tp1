package com.example.AppDepartement.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;

import com.example.AppDepartement.Service.DepartementService;
import com.example.AppDepartement.entities.Departement;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {DepartmentController.class})
@ExtendWith(SpringExtension.class)
class DepartmentControllerTest {
    @MockBean
    private DepartementService departementService;

    @Autowired
    private DepartmentController departmentController;

    /**
     * Method under test: {@link DepartmentController#saveDepartement(Departement)}
     */
    @Test
    void testSaveDepartement() throws Exception {
        doNothing().when(departementService).SaveDepartement((Departement) any());

        Departement departement = new Departement();
        departement.setEnseignant(new ArrayList<>());
        departement.setId(123L);
        departement.setNom("Nom");
        String content = (new ObjectMapper()).writeValueAsString(departement);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/Departement/addDepartement")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(departmentController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{\"id\":123,\"nom\":\"Nom\"}"));
    }
}
