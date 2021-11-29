package baseClass;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

public @Data class Currencies{
    @JsonProperty("JPY") 
    private JPY jPY;
}
