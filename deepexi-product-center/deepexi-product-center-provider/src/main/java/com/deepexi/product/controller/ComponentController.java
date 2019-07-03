package com.deepexi.product.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.deepexi.product.Ids;
import com.deepexi.user.domain.eo.Component;
import com.deepexi.user.service.ComponentService;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.ws.rs.*;

//import com.deepexi.user.service.ComponentService;

@Service
@Path("/api/v1/components")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class ComponentController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference(version = "${demo.service.version}")
    private ComponentService componentService;

    @GET
    @Path("/")
    public Payload getComponentList(@QueryParam("page") @DefaultValue("1")  Integer page,
                                  @QueryParam("size") @DefaultValue("10")  Integer size,
                                  @QueryParam("componentName") String componentName,
                                  @QueryParam("category") String category,
                                  @QueryParam("state") @DefaultValue("1") Byte state) {
        return new Payload(componentService.getComponentList(page, size, componentName, category, state));
    }

    @GET
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload getComponentById(@PathParam("id") String id) {
        return new Payload(componentService.getComponentById(id));
    }

    @POST
    @Path("/")
    public Payload createComponent(Component component) {
        return new Payload(componentService.createComponent(component));
    }

    @PUT
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload updateComponentById(@PathParam("id") String id, Component component) {
        if (StringUtils.isEmpty(component.getId())) {
            component.setId(id);
        }
        return new Payload(componentService.updateComponentById(component));
    }

    @DELETE
    @Path("/{id:[a-zA-Z0-9]+}")
    public Payload deleteComponentById(@PathParam("id") String id) {
        return new Payload(componentService.deleteComponentById(id));
    }

    @DELETE
    @Path("/")
    public Payload deleteComponentsByIds(Ids<String> ids) {
        return new Payload(componentService.batchDeleteComponentByIds(ids.getIds()));
    }
}
