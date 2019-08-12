# poker-hands

## 1
description:单张比较 
given: 2H 
	   3D 
return:playerB 

## 2
description:单张比较 
given: 3H 
       3D 
return:play even 

## 3
description:单张和一对比较 
given: 2H3H 
       3D3S 
return:playerB    

## 4
description:一对比较 
given: 3C3H 
       3D3S 
return:play even 

## 5
description:单张比较 
given: 2C3H4C7H8C 
       2D3S4D8S9D 
return:playerB 

## 6
description:单张比较 
given: 2C3H4C7H8C 
       2D3S4D7S8D 
return:play even 

## 7
description:单张和一对比较 
given: 2C3H4C7H8C 
       2D3S4D7S7D 
return:playerB 

## 8
description:一对比较 
given: 2C3H4C7H7C 
       2D3S4D7S7D 
return:play even 

## 9
description:一对比较 
given: 2C3H4C7H7C 
       2D3S5D7S7D 
return:playerB 

## 10
description:两对比较 
given: 2C3H3C4H4C 
       2D3S3D5S5D 
return:playerB 

## 11
description:两对比较 
given: 2C4H4C5H5C 
       3D4S4D5S5D 
return:playerB 

## 12
description:一对和两对比较 
given: 2C4H4C5H6C  
       3D4S4D5S5D 
return:playerB 

## 13
description:单张和两对比较 
given: 2C3H4C5H7C 
       3D4S4D5S5D 
return:playerB 

## 14
description:两对和三张比较 
given: 2C3H3C5H5C 
       3D4S5D5S5D 
return:playerB 

## 15
description:顺子和三张比较 
given: 2C3H4C5H6C 
       3D4S5D5S5D 
return:playerA 

## 16
description:顺子比较 
given: 2C3H4C5H6C 
       3D4S5D6S7D 
return:playerB 

## 17
description:同花和顺子比较 
given: 2C3C4C5C9C 
       3D4S5D6S7D 
return:playerA 

## 18
description:同花比较 
given: 2C3C4C5C9C 
       3D4D5D6D9D 
return:playerB 

## 19
description:三张带两对和同花比较 
given: 2C2D3H3S3D 
       4D5D6D7D9D 
return:playerA 

## 20
description:三张带两对比较 
given: 2C2D3H3S3D 
       4D4C5D5C5H 
return:playerB 

## 21
description:四条和三张带两对比较 
given: 2C3S3H3S3D 
       4D4C5D5C5H 
return:playerA 

## 22
description:四张比较 
given: 2C3S3H3S3D 
       4D5S5D5C5H 
return:playerB 

## 23
description:同花顺和四张比较 
given: 2C3C4C5C6C 
       4D5S5D5C5H 
return:playerA 

## 24
description:同花顺比较 
given: 2C3C4C5C6C 
       3H4H5H6H7H 
return:playerB 