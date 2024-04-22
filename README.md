Inventory app
==================================

Introducción
------------

Es una aplicación de seguimiento de inventarios. Demuestra como agregar, actualizar, vender y eliminar elementos desde una base de datos local.
Esta aplicación demustra el uso del componente [Room](https://developer.android.com/training/data-storage/room) database de Android Jetpack.
Se hace uso del [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel),
[Flow](https://developer.android.com/kotlin/flow),
y [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/).

Pre-requisitos
--------------

Se necesita tener conocimiento sobre:
- Como crear y utilizar composables.
- Como navegar entre composables, y pasar datos entre ellos.
- Como utilizar componentes de arquitectura incluyendo ViewModel, Flow, StateFlow, StateUi
- Como utilizar corutinas para tareas asíncronas
- Base de datos SQLite

Componentes utilizados
--------------

- Inyección de dependencias manual
- Proveedor de ViewModel
- Navegación en compose
- Scaffold Composable
- Room Database
- Flows
- Coroutines

Funcionalidades de la aplicación
--------------

1. Creación de articulos del inventario
![inventory_add.jpg](app%2Fsampledata%2Finventory_add.jpg)

2. Validación de los datos
![inventory_validation.jpg](app%2Fsampledata%2Finventory_validation.jpg)

3. Consulta de artículos
![inventory_read.jpg](app%2Fsampledata%2Finventory_read.jpg)

4. Detalle de artículo y funcionalidad de venta
![inventory_details.jpg](app%2Fsampledata%2Finventory_details.jpg)

5. Actualización de los datos del artículo
![inventory_update.jpg](app%2Fsampledata%2Finventory_update.jpg)