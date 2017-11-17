package com.company;

import com.company.Invitee;
import com.company.Inviter;
import com.company.Repository;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "repository",
        "invitee",
        "inviter",
        "permissions",
        "created_at",
        "url",
        "html_url"
})
public class Putschema {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("repository")
    private Repository repository;
    @JsonProperty("invitee")
    private Invitee invitee;
    @JsonProperty("inviter")
    private Inviter inviter;
    @JsonProperty("permissions")
    private String permissions;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    @JsonProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @JsonProperty("invitee")
    public Invitee getInvitee() {
        return invitee;
    }

    @JsonProperty("invitee")
    public void setInvitee(Invitee invitee) {
        this.invitee = invitee;
    }

    @JsonProperty("inviter")
    public Inviter getInviter() {
        return inviter;
    }

    @JsonProperty("inviter")
    public void setInviter(Inviter inviter) {
        this.inviter = inviter;
    }

    @JsonProperty("permissions")
    public String getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}