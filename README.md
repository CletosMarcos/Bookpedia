This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
   
* `/iosApp` contains iOS applications. Even if sharing UI with Compose Multiplatform, 
  we need this entry point for the iOS app. This is also where SwiftUI code for the project should be added .
