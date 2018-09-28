
org.springframework.cloud.contract.spec.Contract.make {
    description "should return even when number input is even"
    request{
        method GET()
        url("/validate/prime-number2") {
            queryParameters {
                parameter("number", "2")
            }
        }
    }
    response {
        body("Even")
        status 200
    }
}
