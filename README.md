Inventory app
==================================

Introducción
------------

Es una aplicación de seguimiento de inventarios. Demuestra como agregar, actualizar, vender y
eliminar elementos desde una base de datos local.
Esta aplicación demustra el uso del
componente [Room](https://developer.android.com/training/data-storage/room) database de Android
Jetpack.
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

- Inyección de dependencias manual (application class)
- Proveedor de ViewModel (viewModelFactory)
- Navegación en compose (Nav Host)
- Scaffold Composable
- Room Database
- Flows
- Coroutines

Funcionalidades de la aplicación
--------------

1. Validación de los datos del artículo

<img src="https://github.com/EduardoPosas/android-room-db-implementation/blob/608e6c99e74ff5c3970a508b5cc25219efdaee00/app/sampledata/inventory_validation.jpg" width="250" alt="item validation screen" />

2. Creación de articulos del inventario

<img src="https://github.com/EduardoPosas/android-room-db-implementation/blob/608e6c99e74ff5c3970a508b5cc25219efdaee00/app/sampledata/inventory_add.jpg" width="250" alt="add item screen" />

3. Consulta de artículos

<img src="https://github.com/EduardoPosas/android-room-db-implementation/blob/608e6c99e74ff5c3970a508b5cc25219efdaee00/app/sampledata/inventory_read.jpg" width="250" alt="read items screen" />

4. Detalle de artículo y funcionalidad de venta

<img src="https://github.com/EduardoPosas/android-room-db-implementation/blob/608e6c99e74ff5c3970a508b5cc25219efdaee00/app/sampledata/inventory_details.jpg" width="250" alt="item details screen" />

5. Actualización de los datos del artículo

<img src="https://github.com/EduardoPosas/android-room-db-implementation/blob/608e6c99e74ff5c3970a508b5cc25219efdaee00/app/sampledata/inventory_update.jpg" width="250" alt="update item screen" />
