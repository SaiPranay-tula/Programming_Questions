#!/usr/bin/env python
# coding: utf-8

#  Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array,print true. Else return false. 
#  
#  
# input =12 3 4 1 6 9
# 24
# output =
# true
# 
# input =17 5 21 12 3 4 11 26 9
# 57
# output =
# false

# In[2]:



l=[int(x) for x in input().split(" ")]
n=int(input())
flag=1
def gh():
    
 for i in range(len(l)):
     for j in range(1,len(l)):
         for k in range(2,len(l)):
             if l[i]+l[j]+l[k]==n:
                 #print(True)
                 
                 return True
 return False           

print(gh())


# 

# In[15]:


l=[int(x) for x in input().split(" ")]
n=int(input())
flag=1
def gh():
    
 for i in range(len(l)):
     for j in range(1,len(l)-1):
            v=l[i]+l[j]
            z=n-v
            if z in l:
                return True
           # print(l[i],l[j],l[j+1],end=" ")
            #print(l[i]+l[j]+l[j+1])
            
 return False           

print(gh())


# In[ ]:




