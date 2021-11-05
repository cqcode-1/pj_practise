import { axios } from '@/utils/request'

export function queryCompany() {
    return axios({
        url: '/estate/queryCompany',
        method: 'get'
    })
}

export function insertEstate(param) {
    return axios({
        url: '/estate/insertEstate',
        method: 'psot',
        data: param,
        headers: {
            'Content-Type': 'application/json;charset=UTF-8'
        }
    })
}
