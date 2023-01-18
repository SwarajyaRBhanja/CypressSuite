Feature: End to End Testing For Add to Cart Functionality

  Scenario Outline: Check user Successful response with valid cart-id with valid addtocart payload

    Given User sets the base API request <URL>
    And User authenticates the API request with <x-api-key>
    When User sends the API request to get all the repos
    Then User validates the response status is <code>

    Examples:
    | URL | x-api-key | code |
    | https://npr-create-guest-customer.api.pens.com/    | NSjMi38PBJ6s1rvNMA9FKO6FRn2iDd95bEDoaij8          | ERROR_INVALID_JSON     |





