/*
 * gitlab.com/agendarentrega/servicos/pedido/proto/config.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.agendarentrega.clients.pedido.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets accountUserType
 */
@JsonAdapter(AccountUserType.Adapter.class)
public enum AccountUserType {
  
  API("Type_API"),
  
  USER("Type_USER");

  private String value;

  AccountUserType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountUserType fromValue(String text) {
    for (AccountUserType b : AccountUserType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountUserType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountUserType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountUserType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountUserType.fromValue(String.valueOf(value));
    }
  }
}

