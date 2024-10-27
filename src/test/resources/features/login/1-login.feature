@Suite @Login
Feature: CP001 - Validar Inicio de sesión

  Background: Validar el inicio de sesión con credenciales válidas e inválidas

    Given el usuario navega al sitio web

    @ValidCredentials
    Scenario: 1 - Validar con credenciales correctas
      When ingresa credenciales válidas
      Then la aplicación debería mostrar el módulo principal de productos

    @InvalidCredentials
    Scenario: 2 - Válidar con credenciales incorrectas
      When ingresa credenciales inválidas
      Then la aplicación debería mostrar un mensaje de error