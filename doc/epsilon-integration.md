Integration of Epsilon code generation
===

Create button in Eclipse
---
Generation of code from some sfsm model should be possible by clicking a button. To do this, a new project is created (be.kuleuven.simplefsm.transform) with sample code from the "Hello World Command" sample plugin project.

At this point, the extension points should be edited and the handler.java should be implemented. The handler will need to call the Epsilon code generator.

Call Epsilon Code Generator
---
###Import be.kuleuven.epsilon.service
To call the Epsilon services, the `be.kuleuven.rodinia.epsilon.service` is imported into the current workspace.

###Add dependencies to be.kuleuven.learning.simplefsm.transform
* org.eclipse.core.runtime,
* org.eclipse.ui.ide;bundle-version="3.9.1",
* org.eclipse.epsilon.common;bundle-version="1.1.0",
* org.eclipse.epsilon.ecl.dt;bundle-version="1.1.0",
* org.eclipse.epsilon.ecl.engine;bundle-version="1.1.0",
* org.eclipse.epsilon.egl.engine;bundle-version="1.1.0",
* org.eclipse.epsilon.emc.emf;bundle-version="1.1.0",
* org.eclipse.epsilon.eml.dt;bundle-version="1.1.0",
* org.eclipse.epsilon.eml.engine;bundle-version="1.1.0",
* org.eclipse.epsilon.eol.engine;bundle-version="1.1.0",
* org.eclipse.epsilon.epl.dt;bundle-version="1.1.0",
* org.eclipse.epsilon.etl.engine;bundle-version="1.1.0",
* org.eclipse.epsilon.erl.engine;bundle-version="1.0.0",
* be.kuleuven.rodinia.epsilon.service;bundle-version="1.0.0"

###component
The component.xml will connect the handler with the Epsilon services

* create folder OSGI-INF
* create component.xml in folder with correct content
* add OSGI-INF/ to bin.includes
* create Component.java with correct content

###register model
To generate code, Epsilon needs access to the sfsm metamodel.

* create ecore model from xcore (see xcore tutorial)
* register ecore model in Epsilon
    * right click on .ecore-file and choose Register Epackages

###implement handler
* code taken from Rodinia
* changed parameters in `doEtlTransformation()`

###create egl files
The Epsilon Generation Language will be used to generate the wanted source code.

* create folder epsilon
* create package.egl in folder
* add epsilon/ to bin.includes

Write EGL
---
