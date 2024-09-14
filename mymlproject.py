#!/usr/bin/env python3
import pickle
import sys
pickled_model = pickle.load(open('model.pkl', 'rb'))
# 1. Online Order
# 2. Book Table
# 3. Votes
# 4. Location
# 5. Rest Type
# 6. Dish Liked
# 7. Cuisines
# 8. Type
# 9. Cost for two people

value = pickled_model.predict([sys.argv[1:]])

print(value)