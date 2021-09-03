Feature: OrangeHrm Login Page Using DataTable without header
  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully
    Examples:

      | Admin | admin123 |
      | admin | admin123 |