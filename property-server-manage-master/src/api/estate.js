import { axios } from '@/utils/request'

export function queryCompany() {
    return axios({
        url: '/estate/queryCompany',
        method: 'get'
    })
}

export function insertEstate(param) {
    console.log('param', param)
    return axios({
        url: '/estate/insertEstate',
        method: 'post',
        data: param
    })
}

export function insertEstate1() {
    console.log()
    return axios({
        url: '/estate/insertEstate',
        method: 'get'
    })
}
