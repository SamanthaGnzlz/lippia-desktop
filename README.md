# Lippia Desktop
[![Crowdar Official Page](https://img.shields.io/badge/crowdar-official%20page-brightgreen)](https://crowdar.com.ar/)
[![Lippia Official Page](https://img.shields.io/badge/lippia-official%20page-brightgreen)](https://www.lippia.io/)

#### Lippia Desktop is a core level extension that allows us to automate user interface level testing for desktop applications   
_Keep in mind that it only supports running on **Windows**_

## Requirements
+ **JDK** [Download](https://www.oracle.com/java/technologies/downloads/#java8-windows)
+ **Maven** [Download](https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.zip)
+ **WinAppDriver** [Download](https://github.com/microsoft/WinAppDriver/releases/download/v1.2.1/WindowsApplicationDriver_1.2.1.msi)
+ **Git Client** [Download](https://github.com/git-for-windows/git/releases/download/v2.38.1.windows.1/Git-2.38.1-64-bit.exe)

### Recommended inspection tool
+ **Windows SDK** [Download](https://go.microsoft.com/fwlink/p/?linkid=2196241)   
    Reference [Open](https://learn.microsoft.com/es-es/windows/win32/winauto/inspect-objects) 

## Getting Started

```bash
$ git clone https://gitlab.com/coreupt/lippia-desktop-sample.git && cd "$(basename "$_" .git)"
```

#### Once the project is cloned and opened with your preferred ide, we need to run the WinAppDriver binary   
_The path is usually **C:\Program Files (x86)\Windows Application Driver**_

#### Finally, we can run the tests with the following command: 
```bash
$ mvn clean test
```