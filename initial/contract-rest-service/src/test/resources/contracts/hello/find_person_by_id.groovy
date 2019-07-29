import org.springframework.cloud.contract.spec.Contract
[Contract.make {
    description "1"

    request {
        url "/person/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                id: 1,
                name: "Richard",
                surname: "Gere"
        )
    }
},

Contract.make {
    description "getting 2"

    request {
        url "/person/2"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                id: 2,
                name: "Emma",
                surname: "Choplin"
        )
    }
}]

