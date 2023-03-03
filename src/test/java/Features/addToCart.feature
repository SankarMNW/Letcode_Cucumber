@E2E
Feature: Add to Cart Demo

  Background: 
    #Given User should navigate to the application
    Given User clicks on the login link

  @Cleanup
  Scenario Outline: Add a product to the cart
    And User should login as "<username>" and "<password>"
    And User search a "<book>"
    When User add the book to the cart
    Then The cart badge should be update

    @test
    Examples: 
      | username | password | book                 |
      | ortoni   | pass1234 | Soul of the Sword    |
      | ortonikc | pass1234 | A Princess in Theory |

    @dev
    Examples: 
      | username | password | book                      |
      | ortoni   | pass1234 | Marriage of Inconvenience |
