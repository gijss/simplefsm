Xcore - Xtext integration
===

This document explains how the Xcore metamodel is used to define the Xtext grammar. 

First version
---

I used [this blog post](http://koehnlein.blogspot.ca/2013/06/using-xcore-in-xtext.html) as a reference.

1. Create Xcore project and define sfsm.xcore
2. Create Xtext project
    1. add be.kuleuven.learning.simplefsm.model to dependencies
    2. add org.eclipse.emf.ecore.xcore to dependencies
    3. add `loadedResource = "platform:/resource/be.kuleuven.learning.simplefsm.model/model/simplefsm.xcore"` to GenerateSfsm.mwe2
    4. replace `generate sfsm "http://www.kuleuven.be/learning/simplefsm/Sfsm"` with `import "be.kuleuven.learning.simplefsm"`
    5. write grammar!
