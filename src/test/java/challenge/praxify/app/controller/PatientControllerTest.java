package challenge.praxify.app.controller;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import challenge.praxify.app.bo.Patient;
import challenge.praxify.app.builder.PatientBuilder;
import challenge.praxify.app.config.MongoConfiguration;
import challenge.praxify.app.config.ServiceContext;
import challenge.praxify.app.service.PatientService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MongoConfiguration.class,ServiceContext.class})
@WebAppConfiguration
public class PatientControllerTest {
	private MockMvc mockMvc;

 
    @Autowired
    private WebApplicationContext webApplicationContext;
 
    @Before
    public void setUp() {
        //Mockito.reset(patientServiceMock);
 
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void findAll_ShouldAddTodoEntriesToModelAndRenderTodoListView() throws Exception {
        Patient first = new PatientBuilder()
                .medicalProfile(null)
                .UIDAI("SomeUIDAI")
                .build();
 
        Patient second = new PatientBuilder()
        .medicalProfile(null)
        .UIDAI("SomeUIDAI")
        .build();

        PatientService patientServiceMock = mock(PatientService.class);
        when(patientServiceMock.getList()).thenReturn(Arrays.asList(first, second));
 
        /*mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("todo/list"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/todo/list.jsp"))
                .andExpect(model().attribute("todos", hasSize(2)))
                .andExpect(model().attribute("todos", hasItem(
                        allOf(
                                hasProperty("id", is(1L)),
                                hasProperty("description", is("Lorem ipsum")),
                                hasProperty("title", is("Foo"))
                        )
                )))
                .andExpect(model().attribute("todos", hasItem(
                        allOf(
                                hasProperty("id", is(2L)),
                                hasProperty("description", is("Lorem ipsum")),
                                hasProperty("title", is("Bar"))
                        )
                )));
 
        verify(patientServiceMock, times(1)).findAll();
        verifyNoMoreInteractions(patientServiceMock);*/
    }
}

