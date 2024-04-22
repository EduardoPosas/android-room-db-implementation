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

<img src="sampledata/inventory_add.jpg" width="250" alt="add item" />

2. Validación de los datos

<img src="sampledata/inventory_validation.jpg" width="250" alt="add item" />


3. Consulta de artículos

<img src="sampledata/inventory_read.jpg" width="250" alt="add item" />


4. Detalle de artículo y funcionalidad de venta

<img src="sampledata/inventory_details.jpg" width="250" alt="add item" />


5. Actualización de los datos del artículo

<img src="sampledata/inventory_update.jpg" width="250" alt="add item" />
