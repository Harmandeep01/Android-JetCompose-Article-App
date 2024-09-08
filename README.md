# Compose Article App

This project is a simple Android application built using Jetpack Compose, demonstrating how to create a basic article card UI. The app is designed to showcase the usage of various Compose components like `Column`, `Text`, and `Image` within the context of a Material Design theme.

## Features

- **Jetpack Compose:** Utilizes Jetpack Compose for building the UI.
- **Material Design:** Follows Material Design guidelines using `MaterialTheme` and `Surface` for a consistent look and feel.
- **Responsive Layout:** Demonstrates a responsive and scalable layout with padding and alignment adjustments.

## Components

### MainActivity

The `MainActivity` class is the entry point of the app. It sets up the Compose content using `setContent` and applies the `ComposeArticleTheme`. Inside the `Surface` container, it invokes the `ComposeArticleApp` composable.

### ComposeArticleApp

This composable serves as the main container of the app's UI. It calls the `ArticleCard` composable, passing in the necessary string resources and image resource.

### ArticleCard

`ArticleCard` is a composable that takes in the following parameters:
- `title`: The title of the article.
- `shortDescription`: A brief description of the article.
- `longDescription`: A detailed description of the article.
- `imagePainter`: A `Painter` resource for displaying the article's image.

The `ArticleCard` composable arranges these elements in a vertical `Column`, with appropriate padding and text alignment.

### Preview

`ComposeArticleAppPreview` provides a preview of the `ComposeArticleApp` composable within the Android Studio preview window, enabling you to visualize the UI without running the app on a device or emulator.

## License
[License Link](https://www.apache.org/licenses/LICENSE-2.0)

## Resources

- **Jetpack Compose Documentation:** [Official Docs](https://developer.android.com/jetpack/compose/documentation)
- **Material Design:** [Material Design Guidelines](https://material.io/design)

## How to Run

1. Clone the repository.
2. Open the project in Android Studio.
3. Sync the project with Gradle files.
4. Run the project on an Android emulator or a physical device.

## Credits

- **Project Development:** [Harmandeep](mailto:sharmandeep954@gmail.com)
- **LinkedIn

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request or open an Issue for any improvements or bug fixes.

## Connect with Me

- [LinkedIn](https://www.linkedin.com/in/harmandeep-87032918b/)
- [GitHub]([https://github.com/Harmandeep01)
-[Gmail]([Harmandeep](mailto:sharmandeep954@gmail.com)
