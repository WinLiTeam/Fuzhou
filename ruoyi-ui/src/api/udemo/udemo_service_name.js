import request from '@/utils/request'

// 查询用户账户DEMO列表
export function listUdemo_service_name(query) {
  return request({
    url: '/udemo/udemo_service_name/list',
    method: 'get',
    params: query
  })
}

// 查询用户账户DEMO详细
export function getUdemo_service_name(id) {
  return request({
    url: '/udemo/udemo_service_name/' + id,
    method: 'get'
  })
}

// 新增用户账户DEMO
export function addUdemo_service_name(data) {
  return request({
    url: '/udemo/udemo_service_name',
    method: 'post',
    data: data
  })
}

// 修改用户账户DEMO
export function updateUdemo_service_name(data) {
  return request({
    url: '/udemo/udemo_service_name',
    method: 'put',
    data: data
  })
}

// 删除用户账户DEMO
export function delUdemo_service_name(id) {
  return request({
    url: '/udemo/udemo_service_name/' + id,
    method: 'delete'
  })
}
