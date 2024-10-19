Ejercicio: Personajes en juego de rol
Imaginemos que estamos desarrollando un juego de rol (RPG) en el que los jugadores pueden elegir entre diferentes tipos de personajes. Queremos utilizar clases abstractas para representar los personajes genéricos y luego crear subclases específicas para cada tipo de personaje.

Crear una clase abstracta llamada Personaje que contenga las siguientes propiedades y métodos abstractos:

nombre (String)
nivel (int)
puntosVida (int)
atacar() - representa la acción de atacar y debe ser implementado en las subclases.
defender() - representa la acción de defenderse y debe ser implementado en las subclases.
Crear dos subclases concretas de Personaje llamadas Paladín y Wizard.

En ambas clases implementar el método atacar() de manera específica contemplando que:
Paladín: al atacar quita 5 puntos de vida al contrincante.
Wizard: al atacar quita 3 puntos de vida al contrincante.
En ambas clases implementar el método defender() de manera específica contemplando que:
Paladín: al defender reduce en 2 puntos de vida el daño recibido por ataque.
Wizard: al defender reduce en 3 puntos de vida el daño recibido por ataque.
En todos los métodos de ataque y defensa imprimir por consola el personaje y la acción.
En el main crear instancias de un Paladín y un Wizard, y permite que ambos realicen acciones de ataque y defensa.

Mostrar el estado de los personajes (nombre, nivel y puntos de vida) después de cada acción.
