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
import com.agendarentrega.clients.pedido.models.AccountUser;
import com.agendarentrega.clients.pedido.models.ProfileProfile;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountUserProfile
 */

public class AccountUserProfile {
  @SerializedName("user")
  private AccountUser user = null;

  @SerializedName("profile")
  private ProfileProfile profile = null;

  public AccountUserProfile user(AccountUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public AccountUser getUser() {
    return user;
  }

  public void setUser(AccountUser user) {
    this.user = user;
  }

  public AccountUserProfile profile(ProfileProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public ProfileProfile getProfile() {
    return profile;
  }

  public void setProfile(ProfileProfile profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUserProfile accountUserProfile = (AccountUserProfile) o;
    return Objects.equals(this.user, accountUserProfile.user) &&
        Objects.equals(this.profile, accountUserProfile.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUserProfile {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

