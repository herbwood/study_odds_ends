import requests

# GET
url = 'http://google.com'
response = requests.get(url = url)
print(response.status_code)
print(response.text)

# Other requests
r = requests.post('http://httpbin.org/post', data = {'key' : 'value'})
r = requests.put('http://httpbin.org/put', data = {'key':'value'})
r = requests.delete('http://httpbin.org/delete')
r = requests.head('http://httpbin.org/get')
r = requests.options('http://httpbin.org/get')

# Passing Parameters In URLs
payload = {'key' : 'value1', 'key2' : 'value2'}
r = requests.get('http://httpbin.org/post', params = payload)
print(r.url)

# change encoding by assigning types of encoding
r.encoding = 'utf-8'

# Binary Response Content
r.content

# Create image from binary data returned by a request
from PIL import Image
from io import BytesIO

i = Image.open(BytesIO(r.content))
i.save('image.png')

# JSON Requests Content
# check status code to see if json response failed
r = requests.get('https://api.github.com/events')
r.json()


# Custom Headers
url = 'https://api.github.com/some/endpoint'
headers = {'user-agent': 'my-app/0.0.1'}

r = requests.get(url, headers=headers)

# For more information
# http://docs.python-requests.org/en/master/user/quickstart/