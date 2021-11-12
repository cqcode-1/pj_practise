const twoStep = {

    state: {
        unitMessage: [],
        estateCode: ''
    },
    mutations: {
        SET_TITLE2(state, payload) {
            state.unitMessage = payload.unitMessage
            state.estateCode = payload.estateCode
            console.log('twoStep', state.unitMessage)
        }
    },
    actions: {

    },
    getters: {

    }

}

export default twoStep
