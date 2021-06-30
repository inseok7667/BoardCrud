<template>

 <div class = "form-group">
    <input type= "text" v-model="board.title"  placeholder="제목 입력" />
    <input type= "text" v-model="board.content" placeholder="내용 입력" />
    <button  v-on:click = "save" > 저장 </button>
       <button  v-on:click = "confirm" > 확인 </button>
    <input type = "file"  v-on:change= "changeFile">
  </div>

 

 </template>


<script>

import axios from 'axios'


export default {
  data() {
    return {
      board : {
          title : null ,
          content : null ,   
      },
      uploadFile : '' ,
    };
  },
  methods: {
    save : function() {
        var formData = new FormData() ;
        formData.append('title' , this.board.title);
        formData.append('content' , this.board.content)
        formData.append('uploadFile' , this.uploadFile)

        axios.post('http://localhost:9000/board/save' , formData
            ).then(response => {
               
                console.log(response)
                // alert('등록되었습니다.')
                //this.$router.push('/board');
            }).catch((ex) => {
                console.warn("ERROR!!!!! : ",ex)
            })
        },
    
    changeFile : function(e) { 
        this.uploadFile =  e.target.files[0] ;
    },
    confirm : function (){
        console.log(this.board.title)
         console.log(this.board.content)
        
         
    },
   
  },


};

</script>

<style>


</style>
