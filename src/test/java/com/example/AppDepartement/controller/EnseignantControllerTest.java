package com.example.AppDepartement.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.example.AppDepartement.Service.EnseignantServices;
import com.example.AppDepartement.entities.Departement;
import com.example.AppDepartement.entities.Enseignant;
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

@ContextConfiguration(classes = {EnseignantController.class})
@ExtendWith(SpringExtension.class)
class EnseignantControllerTest {
    @Autowired
    private EnseignantController enseignantController;

    @MockBean
    private EnseignantServices enseignantServices;

    /**
     * Method under test: {@link EnseignantController#saveEnseignant(Enseignant)}
     */
//    @Test
//    void testSaveEnseignant() throws Exception {
//        Departement departement = new Departement();
//        departement.setEnseignant(new ArrayList<>());
//        departement.setId(2L);
//        departement.setNom("Nom");
//
//        Enseignant enseignant = new Enseignant();
//        enseignant.setAddress("42 Main St");
//        enseignant.setDepartement(departement);
//        enseignant.setGrade("Grade");
//        enseignant.setId(123L);
//        enseignant.setNom("Nom");
//        enseignant.setNumerotelephone("4105551212");
//        enseignant.setPrenom("Prenom");
//        when(enseignantServices.saveEnseignant((Enseignant) any())).thenReturn(enseignant);
//
//        Departement departement1 = new Departement();
//        departement1.setEnseignant(new ArrayList<>());
//        departement1.setId(2L);
//        departement1.setNom("Nom");
//
//        Enseignant enseignant1 = new Enseignant();
//        enseignant1.setAddress("42 Main St");
//        enseignant1.setDepartement(departement1);
//        enseignant1.setGrade("Grade");
//        enseignant1.setId(123L);
//        enseignant1.setNom("Nom");
//        enseignant1.setNumerotelephone("4105551212");
//        enseignant1.setPrenom("Prenom");
//        String content = (new ObjectMapper()).writeValueAsString(enseignant1);
//        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/Enseignant/addEnseignant")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(content);
//        MockMvcBuilders.standaloneSetup(enseignantController)
//                .build()
//                .perform(requestBuilder)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content()
//                        .string(
//                                "{\"nom\":\"Nom\",\"prenom\":\"Prenom\",\"grade\":\"Grade\",\"address\":\"42 Main St\",\"numerotelephone\":\"4105551212\""
//                                        + ",\"departement\":{\"id\":2,\"nom\":\"Nom\"},\"id\":2}"));
//    }

    /**
     * Method under test: {@link EnseignantController#saveEnseignant(Enseignant)}
     */
    @Test
    void testSaveEnseignant2() throws Exception {
        Departement departement = new Departement();
        departement.setEnseignant(new ArrayList<>());
        departement.setId(123L);
        departement.setNom("Nom");

        Enseignant enseignant = new Enseignant();
        enseignant.setAddress("42 Main St");
        enseignant.setDepartement(departement);
        enseignant.setGrade("Grade");
        enseignant.setId(123L);
        enseignant.setNom("Nom");
        enseignant.setNumerotelephone("4105551212");
        enseignant.setPrenom("Prenom");
        when(enseignantServices.saveEnseignant((Enseignant) any())).thenReturn(enseignant);

        Departement departement1 = new Departement();
        departement1.setEnseignant(new ArrayList<>());
        departement1.setId(123L);
        departement1.setNom("Nom");

        Enseignant enseignant1 = new Enseignant();
        enseignant1.setAddress("42 Main St");
        enseignant1.setDepartement(departement1);
        enseignant1.setGrade("Grade");
        enseignant1.setId(123L);
        enseignant1.setNom("Nom");
        enseignant1.setNumerotelephone("4105551212");
        enseignant1.setPrenom("Prenom");
        String content = (new ObjectMapper()).writeValueAsString(enseignant1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/Enseignant/addEnseignant")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(enseignantController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"nom\":\"Nom\",\"prenom\":\"Prenom\",\"grade\":\"Grade\",\"address\":\"42 Main St\",\"numerotelephone\":\"4105551212\""
                                        + ",\"departement\":{\"id\":123,\"nom\":\"Nom\"},\"id\":123}"));
    }
}
