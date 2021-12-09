package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Currencies {
    @JsonProperty("JPY")
    private JPY jPY;
}
