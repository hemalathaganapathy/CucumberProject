Feature: OrangeHRM Page With DataTable Header
  Scenario Outline: Successful Login with Valid Credential
    Given User is on OrangeHRM Home Page
    When User Navigate to OrangeHRM  LogIn Page
    And User enters Valid "<username>" and "<password>"
    Then Message displayed Login Successfully....>
    Examples:
      | username | password |
      | Admin | admin123 |
      | admin | admin123 |
