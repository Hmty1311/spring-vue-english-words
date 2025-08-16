<template>
    <div>
        <h2>英単語学習</h2>
        <p v-if="loading">読み込み中</p>
        <p v-else>{{  message  }}</p>
        <button @click="fetchMessage">再読み込み</button>
    </div>
</template>

<script setup>
import { ref } from 'vue'
import axios from 'axios'

const message = ref('')
const loading = ref(false)

const fetchMessage= async () => {
    loading.value = true
    try {
        const res = await axios.get('http://localhost:8080/api/words')
        message.value = res.data
    }catch (err){
        message.value = '取得失敗:' + err.message
    }finally{
        loading.value = false
    }
}

// 初回読み込み
fetchMessage()
</script>