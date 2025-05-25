year = input('What year were you born? ')
year_i = int(year)

bday = input('Has your birthday happened yet this year? yes/no ')
age = 2025 - year_i

if bday == 'no':
    age = age - 1
age_s = str(age)
if age < 0:
    print('Cheater!')
    print('Your age cannot be ' + age_s)
else:    
    print('Your age is ' + age_s)
