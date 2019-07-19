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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PedidoEntrega
 */

public class PedidoEntrega {
  @SerializedName("data")
  private String data = null;

  @SerializedName("horaInicio")
  private String horaInicio = null;

  public PedidoEntrega data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public PedidoEntrega horaInicio(String horaInicio) {
    this.horaInicio = horaInicio;
    return this;
  }

   /**
   * Get horaInicio
   * @return horaInicio
  **/
  @ApiModelProperty(value = "")
  public String getHoraInicio() {
    return horaInicio;
  }

  public void setHoraInicio(String horaInicio) {
    this.horaInicio = horaInicio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedidoEntrega pedidoEntrega = (PedidoEntrega) o;
    return Objects.equals(this.data, pedidoEntrega.data) &&
        Objects.equals(this.horaInicio, pedidoEntrega.horaInicio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, horaInicio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedidoEntrega {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    horaInicio: ").append(toIndentedString(horaInicio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

