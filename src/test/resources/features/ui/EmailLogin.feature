@REGRESSION @UI

  @EMAIL_LOGIN
  Feature: Execute the scenarios of login into an outlook account

    @SUCCESS_LOGIN
    Scenario: Do a success login in a outlook account
      Given User is in outlook website
      When User uses "valid" credentials
      Then User is logged
