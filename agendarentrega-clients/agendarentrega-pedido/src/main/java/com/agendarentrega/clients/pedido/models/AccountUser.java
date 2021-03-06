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
import com.agendarentrega.clients.pedido.models.AccountUserType;
import com.agendarentrega.clients.pedido.models.UserAuthenticationMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountUser
 */

public class AccountUser {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("type")
  private AccountUserType type = null;

  @SerializedName("authenticationMethod")
  private UserAuthenticationMethod authenticationMethod = null;

  public AccountUser uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public AccountUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AccountUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountUser createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AccountUser type(AccountUserType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public AccountUserType getType() {
    return type;
  }

  public void setType(AccountUserType type) {
    this.type = type;
  }

  public AccountUser authenticationMethod(UserAuthenticationMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * Get authenticationMethod
   * @return authenticationMethod
  **/
  @ApiModelProperty(value = "")
  public UserAuthenticationMethod getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(UserAuthenticationMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUser accountUser = (AccountUser) o;
    return Objects.equals(this.uuid, accountUser.uuid) &&
        Objects.equals(this.username, accountUser.username) &&
        Objects.equals(this.email, accountUser.email) &&
        Objects.equals(this.createdAt, accountUser.createdAt) &&
        Objects.equals(this.type, accountUser.type) &&
        Objects.equals(this.authenticationMethod, accountUser.authenticationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, username, email, createdAt, type, authenticationMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUser {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
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

