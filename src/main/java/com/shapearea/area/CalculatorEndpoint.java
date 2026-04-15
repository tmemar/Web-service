package com.shapearea.area;
import com.area.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
@Endpoint
public class CalculatorEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/calculator";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CircleAreaRequest")
    @ResponsePayload
    public CircleAreaResponse circleArea(@RequestPayload CircleAreaRequest request) {
        CircleAreaResponse response = new CircleAreaResponse();
        double pi=3.14;
        response.setArea((float) (request.getRectangle()*request.getRectangle()*pi));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SquareAreaRequest")
    @ResponsePayload
    public SquareAreaResponse squareArea(@RequestPayload SquareAreaRequest request) {
        SquareAreaResponse response = new SquareAreaResponse();
        double pi=3.14;
        response.setLength((float) (request.getLength()*request.getLength()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ParallelogramAreaRequest")
    @ResponsePayload
    public ParallelogramAreaResponse parallelogramArea(@RequestPayload ParallelogramAreaRequest request) {
        ParallelogramAreaResponse response = new ParallelogramAreaResponse();

        response.setArea((float) (request.getBase()*request.getHeight()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RectangleAreaRequest")
    @ResponsePayload
    public RectangleAreaResponse rectangleArea(@RequestPayload RectangleAreaRequest request) {
        RectangleAreaResponse response = new RectangleAreaResponse();

        response.setArea((float) (request.getLength()*request.getWidth()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TriangleAreaRequest")
    @ResponsePayload
    public TriangleAreaResponse triangleArea(@RequestPayload TriangleAreaRequest request) {
        TriangleAreaResponse response = new TriangleAreaResponse();

        response.setArea((float) (request.getBase()*request.getHeight()/2));
        return response;
    }
}
