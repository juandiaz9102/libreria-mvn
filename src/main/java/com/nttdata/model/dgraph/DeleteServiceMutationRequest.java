package com.nttdata.model.dgraph;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteServiceMutationRequest implements GraphQLOperationRequest {

    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    public static final String OPERATION_NAME = "deleteServiceOrder";

    public Map<String, Object> input = new LinkedHashMap<>();

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input.put("filter",input);
    }

    @Override
    public String getAlias() {
        return "deleteServiceOrder";
    }
}
