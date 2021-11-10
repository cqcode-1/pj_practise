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
    return axios({
        url: '/estate/updateBuilding',
        method: 'post',
        data: param
    })
}

export function updateBuildings(param) {
    return axios({
        url: '/estate/updateBuildings',
        method: 'post',
        data: param
    })
}

export function selectUnit(param) {
    console.log(param)
    return axios({
        url: '/estate/selectUnit',
        method: 'post',
        data: param,
        headers: {
            'Content-Type': 'application/json;charset=UTF-8'
        }
    })
}

export function updateUnit(param) {
    console.log(param)
    return axios({
        url: '/estate/updateUnit',
        method: 'post',
        data: param
    })
}

export function updateUnits(param) {
    console.log(param)
    return axios({
        url: '/estate/updateUnits',
        method: 'post',
        data: param
    })
}
