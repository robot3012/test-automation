#author: yehison cieza
#date: 10/10/2024
#language: es
  Característica: inicio de sesion
    Yo como analista de negocio nececito iniciar sesion en el sitio web con
    mis credenciales de acceso.

  @InicioSesionExitoso
  Escenario: Iniciar sesión exitosamente
    Dado que el usuario navega a la página de inicio de sesión
    Cuando ingresa las credenciales correctas
    Entonces deberia ver la página principal


