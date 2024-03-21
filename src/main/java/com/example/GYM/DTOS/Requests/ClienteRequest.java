package com.example.GYM.DTOS.Requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class ClienteRequest {
    private PersonaRequest persona;
    private List<ClienteRequest> clase;
}