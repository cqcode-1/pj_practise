const oneStep = {
    state: {
        buildingNumber: ''
    },
    mutations: {
        SET_TITLE(state, payload) {
            console.log(payload)
            state.buildingNumber = payload.buildingNumber
        }
    },

    actions: {

    },
    getters: {

    }

}

// 外部需要引用时需要导出
export default oneStep
