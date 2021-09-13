package com.oefening.SOAP.endpoint;

import com.oefening.SOAP.PersonSOAPRepository;
import com.oefening.SOAP.models.GetPersonRequest;
import com.oefening.SOAP.models.GetPersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonEndpoint {

    private static final String NAMESPACE_URI = "http://www.baeldung.com/springsoap/gen";

    private PersonSOAPRepository soapRepository;

    @Autowired
    public PersonEndpoint(PersonSOAPRepository personSOAPRepository){
        this.soapRepository = personSOAPRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
    @ResponsePayload
    public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request) {
        GetPersonResponse response = new GetPersonResponse();
        response.setPerson(soapRepository.findPerson(request.getName()));

        return response;
    }

}
