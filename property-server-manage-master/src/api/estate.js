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

export function selectBuilding(param) {
    return axios({
        url: '/estate/selectBuilding',
        method: 'post',
        data: param
    })
}

export function updateBuilding(param) {
    console.log('request param', param)
    return axios({
        url: '/estate/updateBuilding',
        method: 'post',
        data: param
    })
}
