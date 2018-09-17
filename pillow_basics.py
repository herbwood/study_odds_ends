from PIL import Image

# opening the image
im = Image.open('pictures/french_artist.jpg')

# print the image size
print(im.size)

# save the image in JPG format
im.save('pictures/french_artist.png')

# creating Thumbnail image
size = (64, 64)
im.thumbnail(size)
im.save('pictures/french_artist.png')

# cropping(cutting) images
cropImage = im.crop((100, 100, 150, 150))
cropImage.save('pictures/french_artist.png')

# resizing the image
img2 = im.resize((600, 600))
img2.save('pictures/french_artist.png')

# turning pictures at 90 degrees
img3 = im.rotate(90)
img3.save('pictures/french_artist.png')