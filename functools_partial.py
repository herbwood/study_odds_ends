from functools import partial

# Making new version of a funtion

def power(base, exponent):
    return base * exponent

square = partial(power, exponent = 2)
cube = partial(power, exponent = 3)

# result = 4
square(2)


# Building multiple functions by using a loop 

def power_partials(num):
    power_partials_list = []
    for x in range(1, num):

        # create the partial
        f = partial(power, exponent = x)

        # add the partial to the list
        power_partials_list.append(f)

    return power_partials_list

power_partials(3)

# More sources
# https://gist.github.com/pydanny/11295815