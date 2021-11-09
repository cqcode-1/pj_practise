const oneStep = {
    state: {
        buildingNumber: '',
        estateCode: ''
    },
    mutations: {
        SET_TITLE(state, payload) {
            console.log(payload)
            state.buildingNumber = payload.buildingNumber
            state.estateCode = payload.estateCode
        }
    },

    actions: {

    },
    getters: {

    }

}

// 外部需要引用时需要导出
export default oneStep
