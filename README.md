# PRIMM: Image Processing
In this PRIMM activity, you will learn how to use the BVSD graphics library to achieve a variety of image processing effects. The goal is to help you become more familiar with 2D arrays as well as OOP with respect to the idea of interfaces.

## Documentation for Image, Pixel, and Filter 
[https://monarchcs.org/BVSDJavaLib/](https://monarchcs.org/BVSDJavaLib/)

## Setup
1. In the menu at the bottom left, go to **Java Projects** and **Import Project**.
2. Create a folder called `resources`. Upload an image into that folder.
3. In `ImageProcessor.java` change `Image img = new Image("resources/yourfile.png");` to reflect your filename. 

## Predict
Look in the RegularPixelReplaceFilter file,
1. What does the `apply()` method do?
    > Your answer

2. What do you think `implements Filter` means?
    > Your answer

3. If you modify the array of `Pixel` objects from `Image.getPixels()` does that change the original `Image` object? 
Why/why not? How can you verify for sure?
    > Your answer

4. What is an advantage having `getPixels()` behave this way?
    > Your answer

5. What is a disadvantage?
    > Your answer

## Run
Run the program. What there any output?
    > Your answer


## Investigate
Look in ImageProcessor.java,
1. Annotate the code with what each line does

2. In simple steps, describe how you load an image from file, modify it, and save it.
    > Your answer


## Modify
1. Complete the `apply()` code for `RegularPixelReplaceFilter`

## Make
1. Create a Filter called `InvertFilter`. An invert filter *reverses* the pixels of an image. 
```
rgb(255, 255, 255) → rgb(0, 0, 0)
rgb(0, 0, 0) → rgb(255, 255, 255)
rgb(130, 25, 200) → rgb(125, 230, 55)
```

2. Add driver code to ImageProcessor.java.

