Calculadora Multi-Plataforma usando JavaFX + GluonFX

<div style="display: flex; justify-content: center;">
  <img src="https://user-images.githubusercontent.com/95967506/189198244-070f7da8-cb10-4674-9c2a-590a884878c4.PNG" alt="Calculadora no Windows"/>
  <img src="https://user-images.githubusercontent.com/95967506/189198419-4cc3a303-d224-41ef-83b0-e3961656af89.jpg" alt="Calculadora no Android" style="width: 400px; height: 600px"/>
<div>
Gluon Mobile Applications are Java application written in JavaFX.
These applications ensure that developers can create high performance, great looking, and cloud connected mobile apps from a single Java code base.

This sample contains a simple Gluon Mobile application which can be used to run, test and create a native application for any targeted device.

## Pre-requisites

Please checkout the prerequisites to run this application [here](https://github.com/gluonhq/gluonfx-maven-plugin#requirements).

## Instructions

> **Note**: The following are command line instructions. For IDE specific instructions please checkout [IDE section](https://docs.gluonhq.com/#_ide) of the Gluon documentation.

These application can run on the JVM on desktop platforms. To run the application, execute the following command:

```
mvn gluonfx:run
```

The same application can also run natively for on any targeted OS, including Android, iOS, Linux, Mac and Windows.

To create a native image, execute the following command:

```
mvn gluonfx:build gluonfx:nativerun
```

> **Note**: The above commands are target-platform dependent and might change depending on the platform.
For more details, please check
[GluonFX Maven Goals](https://github.com/gluonhq/gluonfx-maven-plugin#2-goals).

## Configuration

To configure the GluonFX plugin, please checkout the [configuration documentation](https://docs.gluonhq.com/#_configuration).

## More information

Here are some helpful links:

* [Gluon documentation](https://docs.gluonhq.com/)
* [GluonFX Maven Plugin](https://github.com/gluonhq/gluonfx-maven-plugin)
* [GluonFX Gradle Plugin](https://github.com/gluonhq/gluonfx-gradle-plugin)
